package org.apache.commons.lang.time;

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
import static org.apache.commons.lang.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang.time.EqualityUtils.*;
import java.lang.Object;
import java.lang.StringBuffer;
import java.lang.StringBuilder;

public class DurationFormatUtils_format_1779347976225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term153679;
     Object term155368;

    public DurationFormatUtils_format_1779347976225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term154438 = new StringBuffer();
        StringBuilder term154612 = new StringBuilder();
        StringBuilder term154786 = new StringBuilder();
        term153679 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 3);
        Object term154380 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term154552 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term154726 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term154380, term154380.getClass(), "value", term154438);
        setIntField(term154380, term154380.getClass(), "count", 0);
        setElement(term153679, 0, term154380);
        setField(term154552, term154552.getClass(), "value", term154612);
        setIntField(term154552, term154552.getClass(), "count", 0);
        setElement(term153679, 1, term154552);
        setField(term154726, term154726.getClass(), "value", term154786);
        setIntField(term154726, term154726.getClass(), "count", 0);
        setElement(term153679, 2, term154726);
        term155368 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 3);
        Object term155369 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term155370 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term155373 = (byte[]) newByteArray(16);
        Object term155374 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term155375 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term155376 = (byte[]) newByteArray(16);
        Object term155377 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term155378 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term155379 = (byte[]) newByteArray(16);
        setField(term155370, term155370.getClass(), "toStringCache", "");
        setField(term155370, term155370.getClass(), "value", term155373);
        setByteField(term155370, term155370.getClass(), "coder", (byte) 0);
        setIntField(term155370, term155370.getClass(), "count", 0);
        setField(term155369, term155369.getClass(), "value", term155370);
        setIntField(term155369, term155369.getClass(), "count", 0);
        setElement(term155368, 0, term155369);
        setField(term155375, term155375.getClass(), "value", term155376);
        setByteField(term155375, term155375.getClass(), "coder", (byte) 0);
        setIntField(term155375, term155375.getClass(), "count", 0);
        setField(term155374, term155374.getClass(), "value", term155375);
        setIntField(term155374, term155374.getClass(), "count", 0);
        setElement(term155368, 1, term155374);
        setField(term155378, term155378.getClass(), "value", term155379);
        setByteField(term155378, term155378.getClass(), "coder", (byte) 0);
        setIntField(term155378, term155378.getClass(), "count", 0);
        setField(term155377, term155377.getClass(), "value", term155378);
        setIntField(term155377, term155377.getClass(), "count", 0);
        setElement(term155368, 2, term155377);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
        Class<?>[] argTypes = new Class<?>[9];
        argTypes[0] = Array.newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"), 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        argTypes[6] = int.class;
        argTypes[7] = int.class;
        argTypes[8] = boolean.class;
        Object[] args = new Object[9];
        args[0] = term153679;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term153679, term155368));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


