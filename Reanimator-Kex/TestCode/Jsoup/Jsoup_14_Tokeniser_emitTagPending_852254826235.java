package org.jsoup.parser;

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
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.util.LinkedHashMap;

public class Tokeniser_emitTagPending_852254826235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term350119;

    public Tokeniser_emitTagPending_852254826235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term350581 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term350580 = ((Class) term350581).getDeclaredField((String) "EndTag");
        ((Field) term350580).setAccessible(true);
        Object enum910 = ((Field) term350580).get((Object) null);
        LinkedHashMap term350409 = new LinkedHashMap();
        ((LinkedHashMap) term350409).put((Object)null, (Object)null);
        term350119 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term350183 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term350349 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term350579 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term350183, term350183.getClass(), "pendingAttributeName", null);
        setField(term350183, term350183.getClass(), "type", enum910);
        setField(term350349, term350349.getClass(), "attributes", term350409);
        setField(term350183, term350183.getClass(), "attributes", term350349);
        setField(term350119, term350119.getClass(), "tagPending", term350183);
        setBooleanField(term350119, term350119.getClass(), "isEmitPending", false);
        setField(term350119, term350119.getClass(), "emitPending", term350579);
        setBooleanField(term350119, term350119.getClass(), "trackErrors", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "emitTagPending", argTypes, term350119, args);
    }

};


