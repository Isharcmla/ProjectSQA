package org.apache.commons.csv;

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
import static org.apache.commons.csv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Character;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuffer;

public class CSVFormat_format_2070435827385 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term304383;
     Object term302158;

    public CSVFormat_format_2070435827385() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term304435 = new Character((char) 0);
        Character term304487 = new Character((char) 0);
        Character term304539 = new Character((char) 31743);
        Class<? extends Object> term304883 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term304882 = ((Class) term304883).getDeclaredField((String) "ALL");
        ((Field) term304882).setAccessible(true);
        Object enum441 = ((Field) term304882).get((Object) null);
        term304383 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term302328 = (Object[]) newArray("java.lang.String", 0);
        setField(term304383, term304383.getClass(), "quoteChar", term304435);
        setCharField(term304383, term304383.getClass(), "delimiter", (char) 42324);
        setField(term304383, term304383.getClass(), "escape", term304487);
        setField(term304383, term304383.getClass(), "commentStart", term304539);
        setField(term304383, term304383.getClass(), "header", term302328);
        setField(term304383, term304383.getClass(), "quotePolicy", enum441);
        StringBuffer term304697 = new StringBuffer();
        Class<? extends Object> term305039 = Class.forName((String) "java.nio.file.attribute.AclEntryFlag");
        Field term305038 = ((Class) term305039).getDeclaredField((String) "FILE_INHERIT");
        ((Field) term305038).setAccessible(true);
        Object enum442 = ((Field) term305038).get((Object) null);
        StringBuffer term304833 = new StringBuffer();
        term302158 = (Object[]) newArray("java.lang.String", 4);
        Object term304881 = newInstance(Class.forName("java.lang.StringUTF16"));
        setElement(term302158, 0, term304697);
        setElement(term302158, 1, enum442);
        setElement(term302158, 2, term304833);
        setElement(term302158, 3, term304881);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term302158;
        callMethod(klass, "format", argTypes, term304383, args);
    }

};


