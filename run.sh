#!/bin/bash

# Color codes
GREEN='\033[0;32m'
BLUE='\033[0;34m'
NC='\033[0m'

echo -e "${BLUE}=======================================${NC}"
echo -e "${GREEN}   Building and Running Bai04...       ${NC}"
echo -e "${BLUE}=======================================${NC}"

# Run tests to verify cross-platform compatibility
echo -e "${BLUE}Running tests...${NC}"
mvn test

# Run the main application
echo -e "${BLUE}Starting application...${NC}"
mvn exec:java -Dexec.mainClass="banksystem.Main"
