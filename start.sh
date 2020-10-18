#!/usr/bin/env bash
SCRIPT_PATH=${0%/*}
if [ "$0" != "$SCRIPT_PATH" ] && [ "$SCRIPT_PATH" != "" ]; then
  cd SCRIPT_PATH
fi

sh dev/build.sh
docker-compose up