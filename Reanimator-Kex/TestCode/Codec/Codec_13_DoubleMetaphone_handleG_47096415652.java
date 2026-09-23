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
import java.lang.Boolean;

public class DoubleMetaphone_handleG_47096415652 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term656;
     Object term670;
     Object term712;
     Object term714;

    public DoubleMetaphone_handleG_47096415652() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term656 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone"));
        setIntField(term656, term656.getClass(), "maxCodeLen", 4);
        term670 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        Object term671 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term672 = (byte[]) newByteArray(16);
        Object term691 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term692 = (byte[]) newByteArray(16);
        setField(term671, term671.getClass(), "value", term672);
        setByteField(term671, term671.getClass(), "coder", (byte) -119);
        setIntField(term671, term671.getClass(), "count", -6029667);
        setField(term670, term670.getClass(), "primary", term671);
        setField(term691, term691.getClass(), "value", term692);
        setByteField(term691, term691.getClass(), "coder", (byte) -66);
        setIntField(term691, term691.getClass(), "count", -2068769794);
        setField(term670, term670.getClass(), "alternate", term691);
        setIntField(term670, term670.getClass(), "maxLength", -117576464);
        setField(term670, term670.getClass(), "this$0", null);
        term712 = new Integer(-1007160944);
        term714 = new Boolean(false);
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
        args[0] = "uuaPigETmJ";
        args[1] = term670;
        args[2] = term712;
        args[3] = term714;
        try {
            callMethod(klass, "handleG", argTypes, term656, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


