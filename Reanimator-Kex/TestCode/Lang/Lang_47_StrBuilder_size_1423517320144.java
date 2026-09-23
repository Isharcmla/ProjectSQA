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

public class StrBuilder_size_1423517320144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1072;
     Object term38643;

    public StrBuilder_size_1423517320144() {
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
        term38643 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term38644 = (char[]) newCharArray(32);
        setField(term38643, term38643.getClass(), "buffer", term38644);
        setIntField(term38643, term38643.getClass(), "size", 1134449235);
        setField(term38643, term38643.getClass(), "newLine", "RkybSrpybU");
        setField(term38643, term38643.getClass(), "nullText", "xOEqzGAmDU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "size", argTypes, term1072, args);
        assertTrue(recursiveEquals(term1072, term38643));
        assertTrue(recursiveEquals(retValue, 1134449235));
    }

};


