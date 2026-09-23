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

public class DocumentType_outerHtmlHead_47202439963 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44675;
     Object term44747;
     Object term44831;

    public DocumentType_outerHtmlHead_47202439963() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44675 = newInstance(Class.forName("org.jsoup.nodes.DocumentType"));
        term44747 = newInstance(Class.forName("java.nio.ByteBufferAsCharBufferRL"));
        Class<? extends Object> term45481 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term45480 = ((Class) term45481).getDeclaredField((String) "xml");
        ((Field) term45480).setAccessible(true);
        Object enum40 = ((Field) term45480).get((Object) null);
        term44831 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term44831, term44831.getClass(), "syntax", enum40);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.DocumentType");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Appendable");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[3];
        args[0] = term44747;
        args[1] = 0;
        args[2] = term44831;
        try {
            callMethod(klass, "outerHtmlHead", argTypes, term44675, args);
            assertTrue(false);
        }
        catch (ReadOnlyBufferException e) {
        }

    }

};


