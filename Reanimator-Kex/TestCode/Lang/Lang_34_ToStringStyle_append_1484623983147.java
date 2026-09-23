package org.apache.commons.lang3.builder;

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
import java.lang.NullPointerException;
import static org.apache.commons.lang3.builder.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;

public class ToStringStyle_append_1484623983147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2505;
     Object term2549;
     Object term2555;

    public ToStringStyle_append_1484623983147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2505 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term2518 = (byte[]) newByteArray(16);
        setField(term2505, term2505.getClass(), "toStringCache", "dEnhdmILtU");
        setField(term2505, term2505.getClass(), "value", term2518);
        setByteField(term2505, term2505.getClass(), "coder", (byte) -121);
        setIntField(term2505, term2505.getClass(), "count", 1193880199);
        term2549 = (long[]) newLongArray(5);
        setLongElement(term2549, 0, -8257434502486459194L);
        setLongElement(term2549, 1, -8400487765614892086L);
        setLongElement(term2549, 2, 5270370404989704783L);
        setLongElement(term2549, 3, 7411271909051562686L);
        setLongElement(term2549, 4, 4872422362414183754L);
        term2555 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.builder.ToStringStyle");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.StringBuffer");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Array.newInstance(long.class, 0).getClass();
        argTypes[3] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[4];
        args[0] = term2505;
        args[1] = "hoicvmsovO";
        args[2] = term2549;
        args[3] = term2555;
        try {
            callMethod(klass, "append", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


