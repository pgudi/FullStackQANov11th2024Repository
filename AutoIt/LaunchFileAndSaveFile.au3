Run("notepad.exe","C:\Windows")
Sleep(2000)
Send("The temple is at the top of the hill.")
Send("{ENTER}")
Send("There are some mangoes and flowers are in the bascket.")
Send("{ENTER}")
Sleep(2000)
WinClose("*Untitled - Notepad")
Sleep(2000)
ControlClick("Notepad","&Save","Button1")
Sleep(2000)
ControlSetText("Save As","*.txt","Edit1","G:\GitQARepository1\CurrentWorkSpace\FullStackQANov11th2024Repository\AutoIt\SampleFile.txt")
Sleep(2000)
ControlClick("Save As","&Save","Button2")
Sleep(2000)
if (WinExists("Confirm Save As")) Then
	ControlClick("Confirm Save As","&Yes","Button1")
EndIf