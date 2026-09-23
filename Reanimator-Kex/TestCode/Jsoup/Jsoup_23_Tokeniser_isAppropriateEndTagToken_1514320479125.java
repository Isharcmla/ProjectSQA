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

public class Tokeniser_isAppropriateEndTagToken_1514320479125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111864;
     Object term112089;

    public Tokeniser_isAppropriateEndTagToken_1514320479125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term111864 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term111932 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term112038 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term111932, term111932.getClass(), "tagName", "");
        setField(term111864, term111864.getClass(), "tagPending", term111932);
        setField(term112038, term112038.getClass(), "tagName", "");
        setField(term111864, term111864.getClass(), "lastStartTag", term112038);
        term112089 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term112090 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term112093 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term112089, term112089.getClass(), "reader", null);
        setField(term112089, term112089.getClass(), "errors", null);
        setField(term112089, term112089.getClass(), "state", null);
        setField(term112089, term112089.getClass(), "emitPending", null);
        setBooleanField(term112089, term112089.getClass(), "isEmitPending", false);
        setField(term112089, term112089.getClass(), "charBuffer", null);
        setField(term112089, term112089.getClass(), "dataBuffer", null);
        setField(term112090, term112090.getClass(), "tagName", "");
        setField(term112090, term112090.getClass(), "pendingAttributeName", null);
        setField(term112090, term112090.getClass(), "pendingAttributeValue", null);
        setBooleanField(term112090, term112090.getClass(), "selfClosing", false);
        setField(term112090, term112090.getClass(), "attributes", null);
        setField(term112090, term112090.getClass(), "type", null);
        setField(term112089, term112089.getClass(), "tagPending", term112090);
        setField(term112089, term112089.getClass(), "doctypePending", null);
        setField(term112089, term112089.getClass(), "commentPending", null);
        setField(term112093, term112093.getClass(), "tagName", "");
        setField(term112093, term112093.getClass(), "pendingAttributeName", null);
        setField(term112093, term112093.getClass(), "pendingAttributeValue", null);
        setBooleanField(term112093, term112093.getClass(), "selfClosing", false);
        setField(term112093, term112093.getClass(), "attributes", null);
        setField(term112093, term112093.getClass(), "type", null);
        setField(term112089, term112089.getClass(), "lastStartTag", term112093);
        setBooleanField(term112089, term112089.getClass(), "selfClosingFlagAcknowledged", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isAppropriateEndTagToken", argTypes, term111864, args);
        assertTrue(recursiveEquals(term111864, term112089));
    }

};


