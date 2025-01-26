Video explaining each of the main areas in roblox studio
https://www.youtube.com/watch?v=_u3G7t5yyJQ

# StarterPack
- Place tools in here that will be given to all characters when they spawn into the game
- How to add a image to a tool: https://www.youtube.com/watch?v=drQkCsL80KM&t=370s

## Tools
- Creating a "Part" as a child of a "Tool", and naming it "Handle" will automatically show it getting held by a character when equipped within the game.

`
local tool = script.Parent
`
`
tool.Equipped:Connect(function()
   print("this tool has been equipped")
end)
`
`
tool.Unequipped:Connect(function()
   print("this tool has been unequipped")
end)
`
`
tool.Activated:Connect(function()
   print("this tool has been activated")
end)
`
`
tool.Deactivated:Connect(function()
   print("this tool has been deactivated")
end)
`

# Script
- Replicated to all players

# LocalScript
- Only used by a single player
