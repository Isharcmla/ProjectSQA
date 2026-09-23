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

public class StrBuilder_appendNewLine_1790607321346 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90642;
     Object term122926;
     Object term122920;

    public StrBuilder_appendNewLine_1790607321346() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term90642 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term90642, term90642.getClass(), "newLine", "");
        term122926 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term122926, term122926.getClass(), "buffer", null);
        setIntField(term122926, term122926.getClass(), "size", 0);
        setField(term122926, term122926.getClass(), "newLine", "");
        setField(term122926, term122926.getClass(), "nullText", null);
        term122920 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term122920, term122920.getClass(), "buffer", null);
        setIntField(term122920, term122920.getClass(), "size", 0);
        setField(term122920, term122920.getClass(), "newLine", "");
        setField(term122920, term122920.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "appendNewLine", argTypes, term90642, args);
        assertTrue(recursiveEquals(term90642, term122926));
        assertTrue(recursiveEquals(retValue, term122920));
    }

};


