from audit import audit, log_scenario

def automatic_decision(scenario):
    return "passengers" # FIXME always save the passengers

if __name__ == '__main__':
    audit(automatic_decision, 60, seed=8675309)
