package org.boris.functionserver;

import org.boris.variantcodec.VTCollection;
import org.boris.variantcodec.Variant;

public interface Function 
{
    Variant execute(VTCollection args) throws RequestException;
}
