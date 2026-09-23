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
import static org.apache.commons.lang.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang.EqualityUtils.*;
import java.lang.Object;
import java.util.HashMap;

public class Entities_createStringWriter_150325839121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term621;
     Object term582752;
     Object term582711;

    public Entities_createStringWriter_150325839121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term624 = new HashMap();
        term621 = newInstance(Class.forName("org.apache.commons.lang.Entities"));
        Object term622 = newInstance(Class.forName("org.apache.commons.lang.Entities$LookupEntityMap"));
        Object term629 = newInstance(Class.forName("org.apache.commons.lang.IntHashMap"));
        Object[] term630 = (Object[]) newArray("org.apache.commons.lang.IntHashMap$Entry", 20);
        setField(term622, term622.getClass(), "lookupTable", null);
        setIntField(term622, term622.getClass(), "LOOKUP_TABLE_SIZE", 256);
        setField(term622, term622.getClass(), "mapNameToValue", term624);
        setField(term629, term629.getClass(), "table", term630);
        setIntField(term629, term629.getClass(), "count", 0);
        setIntField(term629, term629.getClass(), "threshold", 15);
        setFloatField(term629, term629.getClass(), "loadFactor", 0.75F);
        setField(term622, term622.getClass(), "mapValueToName", term629);
        setField(term621, term621.getClass(), "map", term622);
        HashMap term582754 = new HashMap();
        term582752 = newInstance(Class.forName("org.apache.commons.lang.Entities"));
        Object term582753 = newInstance(Class.forName("org.apache.commons.lang.Entities$LookupEntityMap"));
        Object term582755 = newInstance(Class.forName("org.apache.commons.lang.IntHashMap"));
        Object[] term582756 = (Object[]) newArray("org.apache.commons.lang.IntHashMap$Entry", 20);
        setField(term582753, term582753.getClass(), "lookupTable", null);
        setIntField(term582753, term582753.getClass(), "LOOKUP_TABLE_SIZE", 256);
        setField(term582753, term582753.getClass(), "mapNameToValue", term582754);
        setField(term582755, term582755.getClass(), "table", term582756);
        setIntField(term582755, term582755.getClass(), "count", 0);
        setIntField(term582755, term582755.getClass(), "threshold", 15);
        setFloatField(term582755, term582755.getClass(), "loadFactor", 0.75F);
        setField(term582753, term582753.getClass(), "mapValueToName", term582755);
        setField(term582752, term582752.getClass(), "map", term582753);
        term582711 = newInstance(Class.forName("java.io.StringWriter"));
        Object term582712 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term582713 = (byte[]) newByteArray(11);
        setField(term582712, term582712.getClass(), "toStringCache", null);
        setField(term582712, term582712.getClass(), "value", term582713);
        setByteField(term582712, term582712.getClass(), "coder", (byte) 0);
        setIntField(term582712, term582712.getClass(), "count", 0);
        setField(term582711, term582711.getClass(), "buf", term582712);
        setField(term582711, term582711.getClass(), "writeBuffer", null);
        setField(term582711, term582711.getClass(), "lock", term582712);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.Entities");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "eZFUvlxvGV";
        Object retValue = callMethod(klass, "createStringWriter", argTypes, term621, args);
        assertTrue(recursiveEquals(term621, term582752));
        assertTrue(recursiveEquals(retValue, term582711));
    }

};


