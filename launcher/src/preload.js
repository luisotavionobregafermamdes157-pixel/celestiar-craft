const { contextBridge, ipcRenderer } = require('electron');
contextBridge.exposeInMainWorld('launcher', {
  getVersionManifestUrl: () => ipcRenderer.invoke('minecraft-versions-url')
});
