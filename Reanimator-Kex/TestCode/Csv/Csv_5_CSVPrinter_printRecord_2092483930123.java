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
import java.nio.ReadOnlyBufferException;
import static org.apache.commons.csv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Character;
import java.lang.String;

public class CSVPrinter_printRecord_2092483930123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91519;
     Object term89757;

    public CSVPrinter_printRecord_2092483930123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term91641 = new Character((char) 23682);
        Class<? extends Object> term92510 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term92509 = ((Class) term92510).getDeclaredField((String) "ALL");
        ((Field) term92509).setAccessible(true);
        Object enum93 = ((Field) term92509).get((Object) null);
        term91519 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term91589 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object term91813 = newInstance(Class.forName("java.nio.ByteBufferAsCharBufferRB"));
        setBooleanField(term91519, term91519.getClass(), "newRecord", true);
        setField(term91589, term91589.getClass(), "quoteChar", term91641);
        setCharField(term91589, term91589.getClass(), "delimiter", 'p');
        setField(term91589, term91589.getClass(), "quotePolicy", enum93);
        setField(term91519, term91519.getClass(), "format", term91589);
        setField(term91519, term91519.getClass(), "out", term91813);
        Class<? extends Object> term92666 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term92665 = ((Class) term92666).getDeclaredField((String) "ALL");
        ((Field) term92665).setAccessible(true);
        Object enum94 = ((Field) term92665).get((Object) null);
        term89757 = (Object[]) newArray("java.lang.Object", 1);
        setElement(term89757, 0, enum94);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term89757;
        try {
            callMethod(klass, "printRecord", argTypes, term91519, args);
            assertTrue(false);
        }
        catch (ReadOnlyBufferException e) {
        }

    }

};


