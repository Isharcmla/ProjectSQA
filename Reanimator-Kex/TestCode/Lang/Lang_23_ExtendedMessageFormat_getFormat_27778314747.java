package org.apache.commons.lang3.text;

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
import static org.apache.commons.lang3.text.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.text.EqualityUtils.*;
import java.util.HashMap;

public class ExtendedMessageFormat_getFormat_27778314747 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15550;
     Object term15649;

    public ExtendedMessageFormat_getFormat_27778314747() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term15598 = new HashMap();
        term15550 = newInstance(Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat"));
        setField(term15550, term15550.getClass(), "registry", term15598);
        HashMap term15650 = new HashMap();
        term15649 = newInstance(Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat"));
        setField(term15649, term15649.getClass(), "toPattern", null);
        setField(term15649, term15649.getClass(), "registry", term15650);
        setField(term15649, term15649.getClass(), "locale", null);
        setField(term15649, term15649.getClass(), "pattern", null);
        setField(term15649, term15649.getClass(), "formats", null);
        setField(term15649, term15649.getClass(), "offsets", null);
        setField(term15649, term15649.getClass(), "argumentNumbers", null);
        setIntField(term15649, term15649.getClass(), "maxOffset", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "getFormat", argTypes, term15550, args);
        assertTrue(recursiveEquals(term15550, term15649));
        assertTrue(recursiveEquals(retValue, null));
    }

};


