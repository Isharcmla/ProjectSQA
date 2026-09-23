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
import java.lang.NullPointerException;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class DocumentType_outerHtmlHead_47202439943 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23977;
     Object term24119;

    public DocumentType_outerHtmlHead_47202439943() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23977 = newInstance(Class.forName("org.jsoup.nodes.DocumentType"));
        Object term24035 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term24035, term24035.getClass(), "attributes", null);
        setField(term23977, term23977.getClass(), "attributes", term24035);
        Class<? extends Object> term24903 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term24902 = ((Class) term24903).getDeclaredField((String) "xml");
        ((Field) term24902).setAccessible(true);
        Object enum34 = ((Field) term24902).get((Object) null);
        term24119 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term24119, term24119.getClass(), "syntax", enum34);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.DocumentType");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Appendable");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = 0;
        args[2] = term24119;
        try {
            callMethod(klass, "outerHtmlHead", argTypes, term23977, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


