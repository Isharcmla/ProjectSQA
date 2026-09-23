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
import java.lang.StringIndexOutOfBoundsException;
import static org.apache.commons.lang.text.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class StrBuilder_validateRange_700448254340 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15776;
     Object term15835;
     Object term15837;

    public StrBuilder_validateRange_700448254340() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15776 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term15777 = (char[]) newCharArray(32);
        setField(term15776, term15776.getClass(), "buffer", term15777);
        setIntField(term15776, term15776.getClass(), "size", 282916351);
        setField(term15776, term15776.getClass(), "newLine", "qnvxzwuGKX");
        setField(term15776, term15776.getClass(), "nullText", "EdPAvpluZg");
        term15835 = new Integer(880977281);
        term15837 = new Integer(371943306);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term15835;
        args[1] = term15837;
        try {
            callMethod(klass, "validateRange", argTypes, term15776, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


