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

public class Tokeniser_emit_1272425389215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term194238;
     Object term194370;
     Object term194832;
     Object term194839;

    public Tokeniser_emit_1272425389215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term194238 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term194306 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        setBooleanField(term194238, term194238.getClass(), "isEmitPending", false);
        setField(term194238, term194238.getClass(), "emitPending", null);
        setField(term194238, term194238.getClass(), "errors", term194306);
        Class<? extends Object> term194845 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term194844 = ((Class) term194845).getDeclaredField((String) "EndTag");
        ((Field) term194844).setAccessible(true);
        Object enum356 = ((Field) term194844).get((Object) null);
        term194370 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term194536 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term194370, term194370.getClass(), "type", enum356);
        setField(term194370, term194370.getClass(), "attributes", term194536);
        Class<? extends Object> term195030 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term195029 = ((Class) term195030).getDeclaredField((String) "EndTag");
        ((Field) term195029).setAccessible(true);
        Object enum357 = ((Field) term195029).get((Object) null);
        term194832 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term194833 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term194834 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term194835 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term194832, term194832.getClass(), "reader", null);
        setIntField(term194833, term194833.getClass(), "maxSize", 0);
        setField(term194833, term194833.getClass(), "elementData", null);
        setIntField(term194833, term194833.getClass(), "size", 0);
        setIntField(term194833, term194833.getClass(), "modCount", 0);
        setField(term194832, term194832.getClass(), "errors", term194833);
        setField(term194832, term194832.getClass(), "state", null);
        setField(term194834, term194834.getClass(), "tagName", null);
        setField(term194834, term194834.getClass(), "pendingAttributeName", null);
        setField(term194834, term194834.getClass(), "pendingAttributeValue", null);
        setBooleanField(term194834, term194834.getClass(), "selfClosing", false);
        setField(term194835, term194835.getClass(), "attributes", null);
        setField(term194834, term194834.getClass(), "attributes", term194835);
        setField(term194834, term194834.getClass(), "type", enum357);
        setField(term194832, term194832.getClass(), "emitPending", term194834);
        setBooleanField(term194832, term194832.getClass(), "isEmitPending", true);
        setField(term194832, term194832.getClass(), "charBuffer", null);
        setField(term194832, term194832.getClass(), "dataBuffer", null);
        setField(term194832, term194832.getClass(), "tagPending", null);
        setField(term194832, term194832.getClass(), "doctypePending", null);
        setField(term194832, term194832.getClass(), "commentPending", null);
        setField(term194832, term194832.getClass(), "lastStartTag", null);
        setBooleanField(term194832, term194832.getClass(), "selfClosingFlagAcknowledged", false);
        Class<? extends Object> term195215 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term195214 = ((Class) term195215).getDeclaredField((String) "EndTag");
        ((Field) term195214).setAccessible(true);
        Object enum358 = ((Field) term195214).get((Object) null);
        term194839 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term194840 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term194839, term194839.getClass(), "tagName", null);
        setField(term194839, term194839.getClass(), "pendingAttributeName", null);
        setField(term194839, term194839.getClass(), "pendingAttributeValue", null);
        setBooleanField(term194839, term194839.getClass(), "selfClosing", false);
        setField(term194840, term194840.getClass(), "attributes", null);
        setField(term194839, term194839.getClass(), "attributes", term194840);
        setField(term194839, term194839.getClass(), "type", enum358);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term194370;
        callMethod(klass, "emit", argTypes, term194238, args);
        assertTrue(recursiveEquals(term194238, term194832));
        assertTrue(recursiveEquals(term194370, term194839));
    }

};


