# Projekt_czat_final


User & Server

1. User --> Server

    * login / logoff
    * status

2. Server --> User

    * online / offline

3. User --> User

    * direct messages
    * broadcast messages / group messaging

install telnet in command promt
command in command promt: telnet localhost <port>
Commands:
accounts: admin admin : guest guest
    login <user> <password>
    logoff

    msg <user>  body....
    guest: "msg admin Hello World" <-- sent
    admin: "msg guest Hello World" <-- recv


    #topic <-- chatroom / group chat
    join #topic
    leave #topic
    send: msg #topic body...
    recv: msg #topic:<login> body ...

    there is some GUI but it is not completed yet : |
