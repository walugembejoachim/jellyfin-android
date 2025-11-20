#!/usr/bin/env bash
set -euo pipefail

# Replace visible 'Jellyfin' branding in fastlane metadata files
ROOT="$(cd "$(dirname "$0")/.." && pwd)"
find "$ROOT/fastlane/metadata" -type f -name "*.txt" | while read -r f; do
  # Use perl for in-place, replace capitalized and lowercase occurrences
  perl -i -pe 's/\bJellyfin\b/katandika butandisi/g; s/\bjellyfin\b/katandika butandisi/g' "$f"
done

echo "fastlane metadata rebranded"
