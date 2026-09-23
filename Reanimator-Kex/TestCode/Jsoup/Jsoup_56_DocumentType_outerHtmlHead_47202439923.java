package org.jsoup.nodes;

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
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class DocumentType_outerHtmlHead_47202439923 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10042;
     Object term10102;
     Object term10186;

    public DocumentType_outerHtmlHead_47202439923() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10042 = newInstance(Class.forName("org.jsoup.nodes.DocumentType"));
        term10102 = newInstance(Class.forName("java.nio.DirectCharBufferRS"));
        Class<? extends Object> term10843 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term10842 = ((Class) term10843).getDeclaredField((String) "xml");
        ((Field) term10842).setAccessible(true);
        Object enum16 = ((Field) term10842).get((Object) null);
        term10186 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term10186, term10186.getClass(), "syntax", enum16);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.DocumentType");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Appendable");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[3];
        args[0] = term10102;
        args[1] = 0;
        args[2] = term10186;
        try {
            callMethod(klass, "outerHtmlHead", argTypes, term10042, args);
            assertTrue(false);
        }
        catch (ReadOnlyBufferException e) {
        }

    }

};


