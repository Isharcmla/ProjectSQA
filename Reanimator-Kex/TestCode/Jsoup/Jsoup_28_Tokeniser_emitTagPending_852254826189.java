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
import java.lang.IllegalArgumentException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Tokeniser_emitTagPending_852254826189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term164016;

    public Tokeniser_emitTagPending_852254826189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term164016 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term164080 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term164176 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term164080, term164080.getClass(), "pendingAttributeName", "");
        setField(term164080, term164080.getClass(), "attributes", term164176);
        setField(term164016, term164016.getClass(), "tagPending", term164080);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "emitTagPending", argTypes, term164016, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


