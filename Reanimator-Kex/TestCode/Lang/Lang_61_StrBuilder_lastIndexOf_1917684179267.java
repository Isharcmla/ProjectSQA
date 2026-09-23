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

public class StrBuilder_lastIndexOf_1917684179267 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11510;
     Object term81180;

    public StrBuilder_lastIndexOf_1917684179267() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11510 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term11511 = (char[]) newCharArray(32);
        setField(term11510, term11510.getClass(), "buffer", term11511);
        setIntField(term11510, term11510.getClass(), "size", -1002370457);
        setField(term11510, term11510.getClass(), "newLine", "OIHoJeysUi");
        setField(term11510, term11510.getClass(), "nullText", "WXMWFDGcLB");
        term81180 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term81181 = (char[]) newCharArray(32);
        setField(term81180, term81180.getClass(), "buffer", term81181);
        setIntField(term81180, term81180.getClass(), "size", -1002370457);
        setField(term81180, term81180.getClass(), "newLine", "OIHoJeysUi");
        setField(term81180, term81180.getClass(), "nullText", "WXMWFDGcLB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.text.StrMatcher");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "lastIndexOf", argTypes, term11510, args);
        assertTrue(recursiveEquals(term11510, term81180));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


