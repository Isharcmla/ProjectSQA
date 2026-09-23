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
import java.lang.StringIndexOutOfBoundsException;
import static org.apache.commons.codec.language.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class DoubleMetaphone_handleCH_52385266656 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term610;
     Object term624;
     Object term690;

    public DoubleMetaphone_handleCH_52385266656() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term610 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone"));
        setIntField(term610, term610.getClass(), "maxCodeLen", 4);
        term624 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        Object term625 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term638 = (byte[]) newByteArray(16);
        Object term657 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term670 = (byte[]) newByteArray(16);
        setField(term625, term625.getClass(), "toStringCache", "tbcdzjIfER");
        setField(term625, term625.getClass(), "value", term638);
        setByteField(term625, term625.getClass(), "coder", (byte) -29);
        setIntField(term625, term625.getClass(), "count", -883034806);
        setField(term624, term624.getClass(), "primary", term625);
        setField(term657, term657.getClass(), "toStringCache", "HyxfbSQYBe");
        setField(term657, term657.getClass(), "value", term670);
        setByteField(term657, term657.getClass(), "coder", (byte) -54);
        setIntField(term657, term657.getClass(), "count", 1585847225);
        setField(term624, term624.getClass(), "alternate", term657);
        setIntField(term624, term624.getClass(), "maxLength", 597278769);
        setField(term624, term624.getClass(), "this$0", null);
        term690 = new Integer(-1685132342);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = "ZiaGIbnzTs";
        args[1] = term624;
        args[2] = term690;
        try {
            callMethod(klass, "handleCH", argTypes, term610, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


