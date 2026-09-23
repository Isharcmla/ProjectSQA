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

public class Tokeniser_emitTagPending_852254826165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term130381;
     Object term130883;

    public Tokeniser_emitTagPending_852254826165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term130890 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term130889 = ((Class) term130890).getDeclaredField((String) "EndTag");
        ((Field) term130889).setAccessible(true);
        Object enum321 = ((Field) term130889).get((Object) null);
        term130381 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term130445 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term130611 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term130445, term130445.getClass(), "pendingAttributeName", null);
        setField(term130445, term130445.getClass(), "type", enum321);
        setField(term130445, term130445.getClass(), "attributes", term130611);
        setField(term130381, term130381.getClass(), "tagPending", term130445);
        setBooleanField(term130381, term130381.getClass(), "isEmitPending", false);
        setField(term130381, term130381.getClass(), "emitPending", null);
        Class<? extends Object> term131075 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term131074 = ((Class) term131075).getDeclaredField((String) "EndTag");
        ((Field) term131074).setAccessible(true);
        Object enum322 = ((Field) term131074).get((Object) null);
        term130883 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term130884 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term130885 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term130883, term130883.getClass(), "reader", null);
        setField(term130883, term130883.getClass(), "errors", null);
        setField(term130883, term130883.getClass(), "state", null);
        setField(term130884, term130884.getClass(), "tagName", null);
        setField(term130884, term130884.getClass(), "pendingAttributeName", null);
        setField(term130884, term130884.getClass(), "pendingAttributeValue", null);
        setBooleanField(term130884, term130884.getClass(), "selfClosing", false);
        setField(term130885, term130885.getClass(), "attributes", null);
        setField(term130884, term130884.getClass(), "attributes", term130885);
        setField(term130884, term130884.getClass(), "type", enum322);
        setField(term130883, term130883.getClass(), "emitPending", term130884);
        setBooleanField(term130883, term130883.getClass(), "isEmitPending", true);
        setField(term130883, term130883.getClass(), "charBuffer", null);
        setField(term130883, term130883.getClass(), "dataBuffer", null);
        setField(term130883, term130883.getClass(), "tagPending", term130884);
        setField(term130883, term130883.getClass(), "doctypePending", null);
        setField(term130883, term130883.getClass(), "commentPending", null);
        setField(term130883, term130883.getClass(), "lastStartTag", null);
        setBooleanField(term130883, term130883.getClass(), "selfClosingFlagAcknowledged", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "emitTagPending", argTypes, term130381, args);
        assertTrue(recursiveEquals(term130381, term130883));
    }

};


