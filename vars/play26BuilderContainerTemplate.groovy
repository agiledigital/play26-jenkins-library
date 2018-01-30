def call() {
	return [
		containerTemplate(
			name: 'play26-builder',
			image: 'agiledigital/play26-builder',
	        alwaysPullImage: true,
			command: 'cat',
			ttyEnabled: true
		)
	]
}