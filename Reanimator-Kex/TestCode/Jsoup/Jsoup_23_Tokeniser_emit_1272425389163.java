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
import java.lang.Object;
import java.lang.String;

public class Tokeniser_emit_1272425389163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term128452;
     Object term128588;
     Object term128944;
     Object term128949;

    public Tokeniser_emit_1272425389163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term128452 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term128520 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setBooleanField(term128452, term128452.getClass(), "isEmitPending", false);
        setField(term128452, term128452.getClass(), "emitPending", term128520);
        Class<? extends Object> term128954 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term128953 = ((Class) term128954).getDeclaredField((String) "StartTag");
        ((Field) term128953).setAccessible(true);
        Object enum317 = ((Field) term128953).get((Object) null);
        term128588 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term128588, term128588.getClass(), "type", enum317);
        Class<? extends Object> term129145 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term129144 = ((Class) term129145).getDeclaredField((String) "StartTag");
        ((Field) term129144).setAccessible(true);
        Object enum318 = ((Field) term129144).get((Object) null);
        term128944 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term128945 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term128944, term128944.getClass(), "reader", null);
        setField(term128944, term128944.getClass(), "errors", null);
        setField(term128944, term128944.getClass(), "state", null);
        setField(term128945, term128945.getClass(), "tagName", null);
        setField(term128945, term128945.getClass(), "pendingAttributeName", null);
        setField(term128945, term128945.getClass(), "pendingAttributeValue", null);
        setBooleanField(term128945, term128945.getClass(), "selfClosing", false);
        setField(term128945, term128945.getClass(), "attributes", null);
        setField(term128945, term128945.getClass(), "type", enum318);
        setField(term128944, term128944.getClass(), "emitPending", term128945);
        setBooleanField(term128944, term128944.getClass(), "isEmitPending", true);
        setField(term128944, term128944.getClass(), "charBuffer", null);
        setField(term128944, term128944.getClass(), "dataBuffer", null);
        setField(term128944, term128944.getClass(), "tagPending", null);
        setField(term128944, term128944.getClass(), "doctypePending", null);
        setField(term128944, term128944.getClass(), "commentPending", null);
        setField(term128944, term128944.getClass(), "lastStartTag", term128945);
        setBooleanField(term128944, term128944.getClass(), "selfClosingFlagAcknowledged", false);
        Class<? extends Object> term129336 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term129335 = ((Class) term129336).getDeclaredField((String) "StartTag");
        ((Field) term129335).setAccessible(true);
        Object enum319 = ((Field) term129335).get((Object) null);
        term128949 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term128949, term128949.getClass(), "tagName", null);
        setField(term128949, term128949.getClass(), "pendingAttributeName", null);
        setField(term128949, term128949.getClass(), "pendingAttributeValue", null);
        setBooleanField(term128949, term128949.getClass(), "selfClosing", false);
        setField(term128949, term128949.getClass(), "attributes", null);
        setField(term128949, term128949.getClass(), "type", enum319);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term128588;
        callMethod(klass, "emit", argTypes, term128452, args);
        assertTrue(recursiveEquals(term128452, term128944));
        assertTrue(recursiveEquals(term128588, term128949));
    }

};


