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
import java.lang.NullPointerException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.util.LinkedHashMap;

public class Tokeniser_emitTagPending_852254826257 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term224548;

    public Tokeniser_emitTagPending_852254826257() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term225752 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term225751 = ((Class) term225752).getDeclaredField((String) "EndTag");
        ((Field) term225751).setAccessible(true);
        Object enum389 = ((Field) term225751).get((Object) null);
        Object term224928 = newInstance(Class.forName("java.lang.Object"));
        LinkedHashMap term224838 = new LinkedHashMap();
        ((LinkedHashMap) term224838).put(term224928, term224928);
        term224548 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term224612 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term224778 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term225084 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        Object term225152 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term225222 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term224612, term224612.getClass(), "pendingAttributeName", null);
        setField(term224612, term224612.getClass(), "type", enum389);
        setField(term224778, term224778.getClass(), "attributes", term224838);
        setField(term224612, term224612.getClass(), "attributes", term224778);
        setField(term224548, term224548.getClass(), "tagPending", term224612);
        setBooleanField(term224548, term224548.getClass(), "isEmitPending", false);
        setField(term224548, term224548.getClass(), "emitPending", term225084);
        setIntField(term225152, term225152.getClass(), "maxSize", 2147483647);
        setField(term224548, term224548.getClass(), "errors", term225152);
        setField(term224548, term224548.getClass(), "reader", term225222);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "emitTagPending", argTypes, term224548, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


