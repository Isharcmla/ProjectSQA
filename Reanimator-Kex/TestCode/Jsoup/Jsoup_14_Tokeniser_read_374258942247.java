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
import java.util.ArrayList;
import java.lang.Object;
import java.lang.StringBuilder;

public class Tokeniser_read_374258942247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term369904;

    public Tokeniser_read_374258942247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term369956 = new ArrayList();
        char[] term369780 = (char[]) newCharArray(9);
        StringBuilder term370086 = new StringBuilder();
        ((StringBuilder) term370086).append(term369780);
        term369904 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term370026 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setBooleanField(term369904, term369904.getClass(), "selfClosingFlagAcknowledged", false);
        setBooleanField(term369904, term369904.getClass(), "trackErrors", true);
        setField(term369904, term369904.getClass(), "errors", term369956);
        setIntField(term370026, term370026.getClass(), "pos", 0);
        setField(term369904, term369904.getClass(), "reader", term370026);
        setBooleanField(term369904, term369904.getClass(), "isEmitPending", true);
        setField(term369904, term369904.getClass(), "charBuffer", term370086);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "read", argTypes, term369904, args);
    }

};


