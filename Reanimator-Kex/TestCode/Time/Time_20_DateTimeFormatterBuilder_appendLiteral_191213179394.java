package org.joda.time.format;

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
import static org.joda.time.format.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.joda.time.format.EqualityUtils.*;
import java.util.ArrayList;
import java.lang.Object;

public class DateTimeFormatterBuilder_appendLiteral_191213179394 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138;
     Object term3742;
     Object term3735;

    public DateTimeFormatterBuilder_appendLiteral_191213179394() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term139 = new ArrayList();
        term138 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term143 = newInstance(Class.forName("java.lang.Object"));
        setField(term138, term138.getClass(), "iElementPairs", term139);
        setField(term138, term138.getClass(), "iFormatter", term143);
        Object term3745 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$StringLiteral"));
        setField(term3745, term3745.getClass(), "iValue", "");
        ArrayList term3743 = new ArrayList();
        ((ArrayList) term3743).add(term3745);
        ((ArrayList) term3743).add(term3745);
        term3742 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term3742, term3742.getClass(), "iElementPairs", term3743);
        setField(term3742, term3742.getClass(), "iFormatter", null);
        Object term3738 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$StringLiteral"));
        setField(term3738, term3738.getClass(), "iValue", "");
        ArrayList term3736 = new ArrayList();
        ((ArrayList) term3736).add(term3738);
        ((ArrayList) term3736).add(term3738);
        term3735 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term3735, term3735.getClass(), "iElementPairs", term3736);
        setField(term3735, term3735.getClass(), "iFormatter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PAEBtnZtTD";
        Object retValue = callMethod(klass, "appendLiteral", argTypes, term138, args);
        assertTrue(recursiveEquals(term138, term3742));
        assertTrue(recursiveEquals(retValue, term3735));
    }

};


