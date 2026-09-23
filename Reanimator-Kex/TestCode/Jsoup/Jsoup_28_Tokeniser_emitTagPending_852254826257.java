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
import java.util.LinkedHashMap;

public class Tokeniser_emitTagPending_852254826257 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term247266;
     Object term248585;

    public Tokeniser_emitTagPending_852254826257() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term247490 = new LinkedHashMap();
        term247266 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term247334 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term247430 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term247334, term247334.getClass(), "pendingAttributeName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term247430, term247430.getClass(), "attributes", term247490);
        setField(term247334, term247334.getClass(), "attributes", term247430);
        setField(term247334, term247334.getClass(), "pendingAttributeValue", null);
        setField(term247266, term247266.getClass(), "tagPending", term247334);
        LinkedHashMap term248588 = new LinkedHashMap();
        term248585 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term248586 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term248587 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term248585, term248585.getClass(), "reader", null);
        setField(term248585, term248585.getClass(), "errors", null);
        setField(term248585, term248585.getClass(), "state", null);
        setField(term248586, term248586.getClass(), "tagName", null);
        setField(term248586, term248586.getClass(), "pendingAttributeName", null);
        setField(term248586, term248586.getClass(), "pendingAttributeValue", null);
        setBooleanField(term248586, term248586.getClass(), "selfClosing", false);
        setField(term248587, term248587.getClass(), "attributes", term248588);
        setField(term248586, term248586.getClass(), "attributes", term248587);
        setField(term248586, term248586.getClass(), "type", null);
        setField(term248585, term248585.getClass(), "emitPending", term248586);
        setBooleanField(term248585, term248585.getClass(), "isEmitPending", true);
        setField(term248585, term248585.getClass(), "charBuffer", null);
        setField(term248585, term248585.getClass(), "dataBuffer", null);
        setField(term248585, term248585.getClass(), "tagPending", term248586);
        setField(term248585, term248585.getClass(), "doctypePending", null);
        setField(term248585, term248585.getClass(), "commentPending", null);
        setField(term248585, term248585.getClass(), "lastStartTag", null);
        setBooleanField(term248585, term248585.getClass(), "selfClosingFlagAcknowledged", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "emitTagPending", argTypes, term247266, args);
        assertTrue(recursiveEquals(term247266, term248585));
    }

};


