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

public class StrBuilder_equalsIgnoreCase_1886998450334 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14887;
     Object term14946;
     Object term97477;
     Object term97483;

    public StrBuilder_equalsIgnoreCase_1886998450334() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14887 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term14888 = (char[]) newCharArray(32);
        setField(term14887, term14887.getClass(), "buffer", term14888);
        setIntField(term14887, term14887.getClass(), "size", -1347358701);
        setField(term14887, term14887.getClass(), "newLine", "tsTGdgQYUL");
        setField(term14887, term14887.getClass(), "nullText", "TtGbVmKcnX");
        term14946 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term14947 = (char[]) newCharArray(32);
        setField(term14946, term14946.getClass(), "buffer", term14947);
        setIntField(term14946, term14946.getClass(), "size", 806595993);
        setField(term14946, term14946.getClass(), "newLine", "GJVkUrCVdD");
        setField(term14946, term14946.getClass(), "nullText", "zNdorvdUgu");
        term97477 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term97478 = (char[]) newCharArray(32);
        setField(term97477, term97477.getClass(), "buffer", term97478);
        setIntField(term97477, term97477.getClass(), "size", -1347358701);
        setField(term97477, term97477.getClass(), "newLine", "tsTGdgQYUL");
        setField(term97477, term97477.getClass(), "nullText", "TtGbVmKcnX");
        term97483 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term97484 = (char[]) newCharArray(32);
        setField(term97483, term97483.getClass(), "buffer", term97484);
        setIntField(term97483, term97483.getClass(), "size", 806595993);
        setField(term97483, term97483.getClass(), "newLine", "GJVkUrCVdD");
        setField(term97483, term97483.getClass(), "nullText", "zNdorvdUgu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Object[] args = new Object[1];
        args[0] = term14946;
        Object retValue = callMethod(klass, "equalsIgnoreCase", argTypes, term14887, args);
        assertTrue(recursiveEquals(term14887, term97477));
        assertTrue(recursiveEquals(term14946, term97483));
        assertTrue(recursiveEquals(retValue, false));
    }

};


