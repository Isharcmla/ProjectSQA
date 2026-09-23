package org.apache.commons.lang.text;

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
import static org.apache.commons.lang.text.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang.text.EqualityUtils.*;
import java.util.HashMap;

public class ExtendedMessageFormat_getFormat_115626820643 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15639;
     Object term15923;

    public ExtendedMessageFormat_getFormat_115626820643() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term15687 = new HashMap();
        term15639 = newInstance(Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat"));
        setField(term15639, term15639.getClass(), "registry", term15687);
        HashMap term15924 = new HashMap();
        term15923 = newInstance(Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat"));
        setField(term15923, term15923.getClass(), "toPattern", null);
        setField(term15923, term15923.getClass(), "registry", term15924);
        setField(term15923, term15923.getClass(), "locale", null);
        setField(term15923, term15923.getClass(), "pattern", null);
        setField(term15923, term15923.getClass(), "formats", null);
        setField(term15923, term15923.getClass(), "offsets", null);
        setField(term15923, term15923.getClass(), "argumentNumbers", null);
        setIntField(term15923, term15923.getClass(), "maxOffset", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "getFormat", argTypes, term15639, args);
        assertTrue(recursiveEquals(term15639, term15923));
        assertTrue(recursiveEquals(retValue, null));
    }

};


