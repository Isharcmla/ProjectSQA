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

public class StrBuilder_size_1423517320122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1072;
     Object term35888;

    public StrBuilder_size_1423517320122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1072 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term1073 = (char[]) newCharArray(32);
        setField(term1072, term1072.getClass(), "buffer", term1073);
        setIntField(term1072, term1072.getClass(), "size", 1134449235);
        setField(term1072, term1072.getClass(), "newLine", "RkybSrpybU");
        setField(term1072, term1072.getClass(), "nullText", "xOEqzGAmDU");
        term35888 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term35889 = (char[]) newCharArray(32);
        setField(term35888, term35888.getClass(), "buffer", term35889);
        setIntField(term35888, term35888.getClass(), "size", 1134449235);
        setField(term35888, term35888.getClass(), "newLine", "RkybSrpybU");
        setField(term35888, term35888.getClass(), "nullText", "xOEqzGAmDU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "size", argTypes, term1072, args);
        assertTrue(recursiveEquals(term1072, term35888));
        assertTrue(recursiveEquals(retValue, 1134449235));
    }

};


