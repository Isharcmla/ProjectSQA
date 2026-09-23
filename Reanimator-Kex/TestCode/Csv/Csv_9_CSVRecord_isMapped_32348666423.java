package org.apache.commons.csv;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static org.apache.commons.csv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.csv.EqualityUtils.*;
import java.util.HashMap;
import java.lang.Object;

public class CSVRecord_isMapped_32348666423 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term795;
     Object term4026;

    public CSVRecord_isMapped_32348666423() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term808 = new HashMap();
        term795 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        Object[] term820 = (Object[]) newArray("java.lang.String", 9);
        setField(term795, term795.getClass(), "comment", "nyiiPDVjAc");
        setField(term795, term795.getClass(), "mapping", term808);
        setLongField(term795, term795.getClass(), "recordNumber", 6811161968424632369L);
        setElement(term820, 0, "wSQxaModmm");
        setElement(term820, 1, "UlajhuVLaP");
        setElement(term820, 2, "gGSMzuGICf");
        setElement(term820, 3, "hxCBltsObl");
        setElement(term820, 4, "BndsHwAFMv");
        setElement(term820, 5, "GzFkzHGYFt");
        setElement(term820, 6, "tShwQLRGNe");
        setElement(term820, 7, "LvtrsXUliU");
        setElement(term820, 8, "xLbjWUgOIL");
        setField(term795, term795.getClass(), "values", term820);
        HashMap term4029 = new HashMap();
        term4026 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        Object[] term4030 = (Object[]) newArray("java.lang.String", 9);
        setField(term4026, term4026.getClass(), "comment", "nyiiPDVjAc");
        setField(term4026, term4026.getClass(), "mapping", term4029);
        setLongField(term4026, term4026.getClass(), "recordNumber", 6811161968424632369L);
        setElement(term4030, 0, "wSQxaModmm");
        setElement(term4030, 1, "UlajhuVLaP");
        setElement(term4030, 2, "gGSMzuGICf");
        setElement(term4030, 3, "hxCBltsObl");
        setElement(term4030, 4, "BndsHwAFMv");
        setElement(term4030, 5, "GzFkzHGYFt");
        setElement(term4030, 6, "tShwQLRGNe");
        setElement(term4030, 7, "LvtrsXUliU");
        setElement(term4030, 8, "xLbjWUgOIL");
        setField(term4026, term4026.getClass(), "values", term4030);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVRecord");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "jDtqGUpnZN";
        Object retValue = callMethod(klass, "isMapped", argTypes, term795, args);
        assertTrue(recursiveEquals(term795, term4026));
        assertTrue(recursiveEquals(retValue, false));
    }

};


