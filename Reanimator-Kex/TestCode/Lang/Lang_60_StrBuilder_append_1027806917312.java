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

public class StrBuilder_append_1027806917312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56371;
     Object term99011;
     Object term97911;

    public StrBuilder_append_1027806917312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56371 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term55170 = (char[]) newCharArray(544);
        setIntField(term56371, term56371.getClass(), "size", 480);
        setField(term56371, term56371.getClass(), "buffer", term55170);
        term99011 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term99012 = (char[]) newCharArray(544);
        setCharElement(term99012, 480, (char) 48);
        setField(term99011, term99011.getClass(), "buffer", term99012);
        setIntField(term99011, term99011.getClass(), "size", 481);
        setField(term99011, term99011.getClass(), "newLine", null);
        setField(term99011, term99011.getClass(), "nullText", null);
        term97911 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term97912 = (char[]) newCharArray(544);
        setCharElement(term97912, 480, (char) 48);
        setField(term97911, term97911.getClass(), "buffer", term97912);
        setIntField(term97911, term97911.getClass(), "size", 481);
        setField(term97911, term97911.getClass(), "newLine", null);
        setField(term97911, term97911.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        Object retValue = callMethod(klass, "append", argTypes, term56371, args);
        assertTrue(recursiveEquals(term56371, term99011));
        assertTrue(recursiveEquals(retValue, term97911));
    }

};


