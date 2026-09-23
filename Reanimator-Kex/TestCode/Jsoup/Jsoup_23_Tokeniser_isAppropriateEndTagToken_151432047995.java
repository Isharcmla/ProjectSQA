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

public class Tokeniser_isAppropriateEndTagToken_151432047995 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100027;

    public Tokeniser_isAppropriateEndTagToken_151432047995() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100027 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term100095 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term100163 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term100095, term100095.getClass(), "tagName", null);
        setField(term100027, term100027.getClass(), "tagPending", term100095);
        setField(term100027, term100027.getClass(), "lastStartTag", term100163);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "isAppropriateEndTagToken", argTypes, term100027, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


