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

public class CSVRecord_isConsistent_148187396239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6195;
     Object term6362;

    public CSVRecord_isConsistent_148187396239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term6243 = new HashMap();
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        ((HashMap) term6243).put((Object)null, (Object)null);
        term6195 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        Object[] term6095 = (Object[]) newArray("java.lang.String", 105);
        setField(term6195, term6195.getClass(), "mapping", term6243);
        setField(term6195, term6195.getClass(), "values", term6095);
        HashMap term6364 = new HashMap();
        term6362 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        Object[] term6363 = (Object[]) newArray("java.lang.String", 105);
        setField(term6362, term6362.getClass(), "values", term6363);
        setField(term6362, term6362.getClass(), "mapping", term6364);
        setField(term6362, term6362.getClass(), "comment", null);
        setLongField(term6362, term6362.getClass(), "recordNumber", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVRecord");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isConsistent", argTypes, term6195, args);
        assertTrue(recursiveEquals(term6195, term6362));
        assertTrue(recursiveEquals(retValue, false));
    }

};


