package org.joda.time.field;

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
import static org.joda.time.field.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.joda.time.field.EqualityUtils.*;
import java.lang.Integer;

public class FieldUtils_verifyValueBounds_117832531928 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57;
     Object term59;
     Object term61;

    public FieldUtils_verifyValueBounds_117832531928() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57 = new Integer(1134449235);
        term59 = new Integer(-883034806);
        term61 = new Integer(1585847225);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.field.FieldUtils");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = "PAEBtnZtTD";
        args[1] = term57;
        args[2] = term59;
        args[3] = term61;
        callMethod(klass, "verifyValueBounds", argTypes, null, args);
        assertTrue(recursiveEquals(term57, 1134449235));
        assertTrue(recursiveEquals(term59, -883034806));
        assertTrue(recursiveEquals(term61, 1585847225));
    }

};


