package org.apache.commons.codec.language;

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
import static org.apache.commons.codec.language.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.codec.language.EqualityUtils.*;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Boolean;

public class DoubleMetaphone_handleJ_47096127361 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1332;
     Object term1346;
     Object term1412;
     Object term1414;
     Object term12004;
     Object term12007;

    public DoubleMetaphone_handleJ_47096127361() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1332 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone"));
        setIntField(term1332, term1332.getClass(), "maxCodeLen", 4);
        term1346 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        Object term1347 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term1360 = (byte[]) newByteArray(16);
        Object term1379 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term1392 = (byte[]) newByteArray(16);
        setField(term1347, term1347.getClass(), "toStringCache", "AijpHYOFuy");
        setField(term1347, term1347.getClass(), "value", term1360);
        setByteField(term1347, term1347.getClass(), "coder", (byte) -54);
        setIntField(term1347, term1347.getClass(), "count", -226514366);
        setField(term1346, term1346.getClass(), "primary", term1347);
        setField(term1379, term1379.getClass(), "toStringCache", "SbAoxhfrkn");
        setField(term1379, term1379.getClass(), "value", term1392);
        setByteField(term1379, term1379.getClass(), "coder", (byte) 67);
        setIntField(term1379, term1379.getClass(), "count", 1193880199);
        setField(term1346, term1346.getClass(), "alternate", term1379);
        setIntField(term1346, term1346.getClass(), "maxLength", -1087774327);
        setField(term1346, term1346.getClass(), "this$0", null);
        term1412 = new Integer(-1530420153);
        term1414 = new Boolean(false);
        term12004 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone"));
        setIntField(term12004, term12004.getClass(), "maxCodeLen", 4);
        term12007 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        Object term12008 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term12011 = (byte[]) newByteArray(16);
        Object term12012 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term12015 = (byte[]) newByteArray(16);
        setField(term12008, term12008.getClass(), "toStringCache", "AijpHYOFuy");
        setField(term12008, term12008.getClass(), "value", term12011);
        setByteField(term12008, term12008.getClass(), "coder", (byte) -54);
        setIntField(term12008, term12008.getClass(), "count", -226514366);
        setField(term12007, term12007.getClass(), "primary", term12008);
        setField(term12012, term12012.getClass(), "toStringCache", "SbAoxhfrkn");
        setField(term12012, term12012.getClass(), "value", term12015);
        setByteField(term12012, term12012.getClass(), "coder", (byte) 67);
        setIntField(term12012, term12012.getClass(), "count", 1193880199);
        setField(term12007, term12007.getClass(), "alternate", term12012);
        setIntField(term12007, term12007.getClass(), "maxLength", -1087774327);
        setField(term12007, term12007.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        argTypes[2] = int.class;
        argTypes[3] = boolean.class;
        Object[] args = new Object[4];
        args[0] = "dWRymuLBtr";
        args[1] = term1346;
        args[2] = term1412;
        args[3] = term1414;
        Object retValue = callMethod(klass, "handleJ", argTypes, term1332, args);
        assertTrue(recursiveEquals(term1332, term12004));
        assertTrue(recursiveEquals(term1346, -1530420153));
        assertTrue(recursiveEquals(term1412, term12007));
        assertTrue(recursiveEquals(term1414, false));
        assertTrue(recursiveEquals(retValue, -1530420152));
    }

};


