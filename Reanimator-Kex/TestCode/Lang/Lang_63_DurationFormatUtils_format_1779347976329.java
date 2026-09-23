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

public class DurationFormatUtils_format_1779347976329 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term247235;
     Object term249026;

    public DurationFormatUtils_format_1779347976329() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term248049 = new StringBuffer();
        StringBuffer term248221 = new StringBuffer();
        StringBuffer term248393 = new StringBuffer();
        StringBuffer term248565 = new StringBuffer();
        term247235 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 5);
        Object term247991 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term248163 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term248335 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term248507 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term248679 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term247991, term247991.getClass(), "value", term248049);
        setIntField(term247991, term247991.getClass(), "count", 0);
        setElement(term247235, 0, term247991);
        setField(term248163, term248163.getClass(), "value", term248221);
        setIntField(term248163, term248163.getClass(), "count", 0);
        setElement(term247235, 1, term248163);
        setField(term248335, term248335.getClass(), "value", term248393);
        setIntField(term248335, term248335.getClass(), "count", 0);
        setElement(term247235, 2, term248335);
        setField(term248507, term248507.getClass(), "value", term248565);
        setIntField(term248507, term248507.getClass(), "count", 0);
        setElement(term247235, 3, term248507);
        setField(term248679, term248679.getClass(), "value", "");
        setIntField(term248679, term248679.getClass(), "count", 0);
        setElement(term247235, 4, term248679);
        term249026 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 5);
        Object term249027 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term249028 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term249031 = (byte[]) newByteArray(16);
        Object term249032 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term249033 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term249036 = (byte[]) newByteArray(16);
        Object term249037 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term249038 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term249041 = (byte[]) newByteArray(16);
        Object term249042 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term249043 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term249046 = (byte[]) newByteArray(16);
        Object term249047 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term249028, term249028.getClass(), "toStringCache", "");
        setField(term249028, term249028.getClass(), "value", term249031);
        setByteField(term249028, term249028.getClass(), "coder", (byte) 0);
        setIntField(term249028, term249028.getClass(), "count", 0);
        setField(term249027, term249027.getClass(), "value", term249028);
        setIntField(term249027, term249027.getClass(), "count", 0);
        setElement(term249026, 0, term249027);
        setField(term249033, term249033.getClass(), "toStringCache", "");
        setField(term249033, term249033.getClass(), "value", term249036);
        setByteField(term249033, term249033.getClass(), "coder", (byte) 0);
        setIntField(term249033, term249033.getClass(), "count", 0);
        setField(term249032, term249032.getClass(), "value", term249033);
        setIntField(term249032, term249032.getClass(), "count", 0);
        setElement(term249026, 1, term249032);
        setField(term249038, term249038.getClass(), "toStringCache", "");
        setField(term249038, term249038.getClass(), "value", term249041);
        setByteField(term249038, term249038.getClass(), "coder", (byte) 0);
        setIntField(term249038, term249038.getClass(), "count", 0);
        setField(term249037, term249037.getClass(), "value", term249038);
        setIntField(term249037, term249037.getClass(), "count", 0);
        setElement(term249026, 2, term249037);
        setField(term249043, term249043.getClass(), "toStringCache", "");
        setField(term249043, term249043.getClass(), "value", term249046);
        setByteField(term249043, term249043.getClass(), "coder", (byte) 0);
        setIntField(term249043, term249043.getClass(), "count", 0);
        setField(term249042, term249042.getClass(), "value", term249043);
        setIntField(term249042, term249042.getClass(), "count", 0);
        setElement(term249026, 3, term249042);
        setField(term249047, term249047.getClass(), "value", "");
        setIntField(term249047, term249047.getClass(), "count", 0);
        setElement(term249026, 4, term249047);
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
        args[0] = term247235;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term247235, term249026));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


