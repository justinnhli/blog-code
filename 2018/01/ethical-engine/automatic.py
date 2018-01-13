from audit import audit


def automatic_decision(scenario):
    # FIXME
    return "passengers" # default to saving the passengers


if __name__ == '__main__':
    audit(automatic_decision, 60, seed=8675309)
