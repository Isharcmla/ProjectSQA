package org.apache.commons.lang;

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
import java.lang.NumberFormatException;
import static org.apache.commons.lang.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;

public class Entities_addEntities_11465105912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14;
     Object term27;

    public Entities_addEntities_11465105912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term17 = new HashMap();
        term14 = newInstance(Class.forName("org.apache.commons.lang.Entities"));
        Object term15 = newInstance(Class.forName("org.apache.commons.lang.Entities$LookupEntityMap"));
        Object term22 = newInstance(Class.forName("org.apache.commons.lang.IntHashMap"));
        Object[] term23 = (Object[]) newArray("org.apache.commons.lang.IntHashMap$Entry", 20);
        setField(term15, term15.getClass(), "lookupTable", null);
        setIntField(term15, term15.getClass(), "LOOKUP_TABLE_SIZE", 256);
        setField(term15, term15.getClass(), "mapNameToValue", term17);
        setField(term22, term22.getClass(), "table", term23);
        setIntField(term22, term22.getClass(), "count", 0);
        setIntField(term22, term22.getClass(), "threshold", 15);
        setFloatField(term22, term22.getClass(), "loadFactor", 0.75F);
        setField(term15, term15.getClass(), "mapValueToName", term22);
        setField(term14, term14.getClass(), "map", term15);
        term27 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.String"), 0).getClass(), 5);
        Object[] term28 = (Object[]) newArray("java.lang.String", 4);
        Object[] term77 = (Object[]) newArray("java.lang.String", 3);
        Object[] term114 = (Object[]) newArray("java.lang.String", 4);
        Object[] term163 = (Object[]) newArray("java.lang.String", 1);
        Object[] term176 = (Object[]) newArray("java.lang.String", 6);
        setElement(term28, 0, "PAEBtnZtTD");
        setElement(term28, 1, "sjlJAEtRrb");
        setElement(term28, 2, "MuLcgQHgqz");
        setElement(term28, 3, "xxtlPwDYFs");
        setElement(term27, 0, term28);
        setElement(term77, 0, "jJCZpVmanW");
        setElement(term77, 1, "EGtDIRbSSb");
        setElement(term77, 2, "SzjVpOQTyS");
        setElement(term27, 1, term77);
        setElement(term114, 0, "MjGYSRKTNF");
        setElement(term114, 1, "hRNSzYYIrc");
        setElement(term114, 2, "RMFIsYGgne");
        setElement(term114, 3, "NRdvgJlhkX");
        setElement(term27, 2, term114);
        setElement(term163, 0, "uuaPigETmJ");
        setElement(term27, 3, term163);
        setElement(term176, 0, "MxlszYVzRf");
        setElement(term176, 1, "LQFpaHEwXR");
        setElement(term176, 2, "oVcInYnLWB");
        setElement(term176, 3, "aJlieCFVtF");
        setElement(term176, 4, "ZiaGIbnzTs");
        setElement(term176, 5, "tbcdzjIfER");
        setElement(term27, 4, term176);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.Entities");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Array.newInstance(Class.forName("java.lang.String"), 0).getClass(), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term27;
        try {
            callMethod(klass, "addEntities", argTypes, term14, args);
            assertTrue(false);
        }
        catch (NumberFormatException e) {
        }

    }

};


