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

public class Tokeniser_createTagPending_34563708157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78723;
     Object term79010;
     Object term78991;

    public Tokeniser_createTagPending_34563708157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78723 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Class<? extends Object> term79017 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term79016 = ((Class) term79017).getDeclaredField((String) "StartTag");
        ((Field) term79016).setAccessible(true);
        Object enum270 = ((Field) term79016).get((Object) null);
        term79010 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term79011 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term79012 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term79010, term79010.getClass(), "reader", null);
        setField(term79010, term79010.getClass(), "errors", null);
        setField(term79010, term79010.getClass(), "state", null);
        setField(term79010, term79010.getClass(), "emitPending", null);
        setBooleanField(term79010, term79010.getClass(), "isEmitPending", false);
        setField(term79010, term79010.getClass(), "charBuffer", null);
        setField(term79010, term79010.getClass(), "dataBuffer", null);
        setField(term79011, term79011.getClass(), "tagName", null);
        setField(term79011, term79011.getClass(), "pendingAttributeName", null);
        setField(term79011, term79011.getClass(), "pendingAttributeValue", null);
        setBooleanField(term79011, term79011.getClass(), "selfClosing", false);
        setField(term79012, term79012.getClass(), "attributes", null);
        setField(term79011, term79011.getClass(), "attributes", term79012);
        setField(term79011, term79011.getClass(), "type", enum270);
        setField(term79010, term79010.getClass(), "tagPending", term79011);
        setField(term79010, term79010.getClass(), "doctypePending", null);
        setField(term79010, term79010.getClass(), "commentPending", null);
        setField(term79010, term79010.getClass(), "lastStartTag", null);
        setBooleanField(term79010, term79010.getClass(), "selfClosingFlagAcknowledged", false);
        Class<? extends Object> term79208 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term79207 = ((Class) term79208).getDeclaredField((String) "StartTag");
        ((Field) term79207).setAccessible(true);
        Object enum271 = ((Field) term79207).get((Object) null);
        term78991 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term78993 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term78991, term78991.getClass(), "tagName", null);
        setField(term78991, term78991.getClass(), "pendingAttributeName", null);
        setField(term78991, term78991.getClass(), "pendingAttributeValue", null);
        setBooleanField(term78991, term78991.getClass(), "selfClosing", false);
        setField(term78993, term78993.getClass(), "attributes", null);
        setField(term78991, term78991.getClass(), "attributes", term78993);
        setField(term78991, term78991.getClass(), "type", enum271);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = true;
        Object retValue = callMethod(klass, "createTagPending", argTypes, term78723, args);
        assertTrue(recursiveEquals(term78723, term79010));
        assertTrue(recursiveEquals(retValue, term78991));
    }

};


