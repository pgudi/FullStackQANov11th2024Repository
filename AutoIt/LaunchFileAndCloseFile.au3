Run("notepad.exe","C:\Windows")
Sleep(2000)
Send("The temple is at the top of the hill.")
Send("{ENTER}")
Send("There are some mangoes and flowers are in the bascket.")
Send("{ENTER}")
Sleep(2000)
WinClose("*Untitled - Notepad")
Sleep(2000)
ControlClick("Notepad","Do&n't Save","Button2")
Sleep(2000)