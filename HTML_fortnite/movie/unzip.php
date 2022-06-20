<?php

$zip = new ZipArchive();

if ($zip->open('./Fortnite   2022-05-30 22-42-28.zip') === true) {
	if ($zip->extractTo('./') === true) {
		$zip->close();
	} else {
		exit('Extract Error');
	}
} else {
	exit('Open Error');
}

echo 'Unzip Complete';

?>