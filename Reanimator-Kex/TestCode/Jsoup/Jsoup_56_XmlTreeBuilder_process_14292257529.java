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
import static org.jsoup.parser.EqualityUtils.*;
import java.lang.String;
import java.lang.Object;

public class XmlTreeBuilder_process_14292257529 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67933;
     Object term67991;
     Object term68286;
     Object term68287;

    public XmlTreeBuilder_process_14292257529() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67933 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Class<? extends Object> term68293 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term68292 = ((Class) term68293).getDeclaredField((String) "EOF");
        ((Field) term68292).setAccessible(true);
        Object enum190 = ((Field) term68292).get((Object) null);
        term67991 = newInstance(Class.forName("org.jsoup.parser.Token$EOF"));
        setField(term67991, term67991.getClass(), "type", enum190);
        term68286 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term68286, term68286.getClass(), "reader", null);
        setField(term68286, term68286.getClass(), "tokeniser", null);
        setField(term68286, term68286.getClass(), "doc", null);
        setField(term68286, term68286.getClass(), "stack", null);
        setField(term68286, term68286.getClass(), "baseUri", null);
        setField(term68286, term68286.getClass(), "currentToken", null);
        setField(term68286, term68286.getClass(), "errors", null);
        setField(term68286, term68286.getClass(), "settings", null);
        setField(term68286, term68286.getClass(), "start", null);
        setField(term68286, term68286.getClass(), "end", null);
        Class<? extends Object> term68469 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term68468 = ((Class) term68469).getDeclaredField((String) "EOF");
        ((Field) term68468).setAccessible(true);
        Object enum191 = ((Field) term68468).get((Object) null);
        term68287 = newInstance(Class.forName("org.jsoup.parser.Token$EOF"));
        setField(term68287, term68287.getClass(), "type", enum191);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term67991;
        Object retValue = callMethod(klass, "process", argTypes, term67933, args);
        assertTrue(recursiveEquals(term67933, term68286));
        assertTrue(recursiveEquals(term67991, term68287));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


