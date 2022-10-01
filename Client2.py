import socket
import datetime

host = socket.gethostbyname(socket.gethostname())
port=4001

user=input("Enter the Username whcih is to be displayed in the chat room : ")
def main():
    client = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    client.connect((host,port))
    print("Client connected to server at IP : ",host," Port : ",port)

    connected = True
    while connected:
        
        curr_time=datetime.datetime.now()
        msg = input(f"[{user} at "+str(curr_time.hour)+":"+str(curr_time.minute)+"]: ")
        
        
        message="["+user+" at "+str(curr_time.hour)+":"+str(curr_time.minute)+"]: "+msg
        

        client.send(message.encode())

        if msg == "quit":
            connected = False


if __name__ == "__main__":
    main()