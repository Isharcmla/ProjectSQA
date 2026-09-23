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

public class Tokeniser_createTagPending_345637081121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term152877;
     Object term152994;
     Object term152986;

    public Tokeniser_createTagPending_345637081121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term152877 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term152941 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term152941, term152941.getClass(), "tagName", "");
        setField(term152941, term152941.getClass(), "normalName", null);
        setField(term152941, term152941.getClass(), "pendingAttributeName", null);
        setField(term152941, term152941.getClass(), "pendingAttributeValue", null);
        setField(term152877, term152877.getClass(), "endPending", term152941);
        term152994 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term152995 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term152994, term152994.getClass(), "reader", null);
        setField(term152994, term152994.getClass(), "errors", null);
        setField(term152994, term152994.getClass(), "state", null);
        setField(term152994, term152994.getClass(), "emitPending", null);
        setBooleanField(term152994, term152994.getClass(), "isEmitPending", false);
        setField(term152994, term152994.getClass(), "charsString", null);
        setField(term152994, term152994.getClass(), "charsBuilder", null);
        setField(term152994, term152994.getClass(), "dataBuffer", null);
        setField(term152995, term152995.getClass(), "tagName", null);
        setField(term152995, term152995.getClass(), "normalName", null);
        setField(term152995, term152995.getClass(), "pendingAttributeName", null);
        setField(term152995, term152995.getClass(), "pendingAttributeValue", null);
        setField(term152995, term152995.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term152995, term152995.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term152995, term152995.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term152995, term152995.getClass(), "selfClosing", false);
        setField(term152995, term152995.getClass(), "attributes", null);
        setField(term152995, term152995.getClass(), "type", null);
        setField(term152994, term152994.getClass(), "tagPending", term152995);
        setField(term152994, term152994.getClass(), "startPending", null);
        setField(term152994, term152994.getClass(), "endPending", term152995);
        setField(term152994, term152994.getClass(), "charPending", null);
        setField(term152994, term152994.getClass(), "doctypePending", null);
        setField(term152994, term152994.getClass(), "commentPending", null);
        setField(term152994, term152994.getClass(), "lastStartTag", null);
        setBooleanField(term152994, term152994.getClass(), "selfClosingFlagAcknowledged", false);
        setField(term152994, term152994.getClass(), "codepointHolder", null);
        setField(term152994, term152994.getClass(), "multipointHolder", null);
        term152986 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term152986, term152986.getClass(), "tagName", null);
        setField(term152986, term152986.getClass(), "normalName", null);
        setField(term152986, term152986.getClass(), "pendingAttributeName", null);
        setField(term152986, term152986.getClass(), "pendingAttributeValue", null);
        setField(term152986, term152986.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term152986, term152986.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term152986, term152986.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term152986, term152986.getClass(), "selfClosing", false);
        setField(term152986, term152986.getClass(), "attributes", null);
        setField(term152986, term152986.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = false;
        Object retValue = callMethod(klass, "createTagPending", argTypes, term152877, args);
        assertTrue(recursiveEquals(term152877, term152994));
        assertTrue(recursiveEquals(retValue, term152986));
    }

};


