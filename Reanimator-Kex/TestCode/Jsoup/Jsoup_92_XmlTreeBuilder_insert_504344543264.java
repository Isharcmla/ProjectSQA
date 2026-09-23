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
import java.lang.StringBuilder;

public class XmlTreeBuilder_insert_504344543264 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term299087;
     Object term299219;

    public XmlTreeBuilder_insert_504344543264() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term299087 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term299153 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term299153, term299153.getClass(), "preserveTagCase", false);
        setField(term299087, term299087.getClass(), "settings", term299153);
        char[] term298521 = (char[]) newCharArray(1);
        setCharElement(term298521, 0, (char) 4);
        StringBuilder term299279 = new StringBuilder();
        ((StringBuilder) term299279).append(term298521);
        char[] term298540 = (char[]) newCharArray(128);
        setCharElement(term298540, 0, (char) 1);
        setCharElement(term298540, 1, 'e');
        setCharElement(term298540, 2, 'e');
        setCharElement(term298540, 3, 'e');
        setCharElement(term298540, 4, 'e');
        setCharElement(term298540, 5, 'e');
        setCharElement(term298540, 6, 'e');
        setCharElement(term298540, 7, 'e');
        setCharElement(term298540, 8, 'e');
        setCharElement(term298540, 9, 'e');
        setCharElement(term298540, 10, 'e');
        setCharElement(term298540, 11, 'e');
        setCharElement(term298540, 12, 'e');
        setCharElement(term298540, 13, 'e');
        setCharElement(term298540, 14, 'e');
        setCharElement(term298540, 15, 'e');
        setCharElement(term298540, 16, 'e');
        setCharElement(term298540, 17, 'e');
        setCharElement(term298540, 18, 'e');
        setCharElement(term298540, 19, 'e');
        setCharElement(term298540, 20, 'e');
        setCharElement(term298540, 21, 'e');
        setCharElement(term298540, 22, 'e');
        setCharElement(term298540, 23, 'e');
        setCharElement(term298540, 24, 'e');
        setCharElement(term298540, 25, 'e');
        setCharElement(term298540, 26, 'e');
        setCharElement(term298540, 27, 'e');
        setCharElement(term298540, 28, 'e');
        setCharElement(term298540, 29, 'e');
        setCharElement(term298540, 30, 'e');
        setCharElement(term298540, 31, 'e');
        setCharElement(term298540, 32, 'e');
        setCharElement(term298540, 33, 'e');
        setCharElement(term298540, 34, 'e');
        setCharElement(term298540, 35, 'e');
        setCharElement(term298540, 36, 'e');
        setCharElement(term298540, 37, 'e');
        setCharElement(term298540, 38, 'e');
        setCharElement(term298540, 39, 'e');
        setCharElement(term298540, 40, 'e');
        setCharElement(term298540, 41, 'e');
        setCharElement(term298540, 42, 'e');
        setCharElement(term298540, 43, 'e');
        setCharElement(term298540, 44, 'e');
        setCharElement(term298540, 45, 'e');
        setCharElement(term298540, 46, 'e');
        setCharElement(term298540, 47, 'e');
        setCharElement(term298540, 48, 'e');
        setCharElement(term298540, 49, 'e');
        setCharElement(term298540, 50, 'e');
        setCharElement(term298540, 51, 'e');
        setCharElement(term298540, 52, 'e');
        setCharElement(term298540, 53, 'e');
        setCharElement(term298540, 54, 'e');
        setCharElement(term298540, 55, 'e');
        setCharElement(term298540, 56, 'e');
        setCharElement(term298540, 57, 'e');
        setCharElement(term298540, 58, 'e');
        setCharElement(term298540, 59, 'e');
        setCharElement(term298540, 60, 'e');
        setCharElement(term298540, 61, 'e');
        setCharElement(term298540, 62, 'e');
        setCharElement(term298540, 63, 'e');
        setCharElement(term298540, 64, 'e');
        setCharElement(term298540, 65, 'e');
        setCharElement(term298540, 66, 'e');
        setCharElement(term298540, 67, 'e');
        setCharElement(term298540, 68, 'e');
        setCharElement(term298540, 69, 'e');
        setCharElement(term298540, 70, 'e');
        setCharElement(term298540, 71, 'e');
        setCharElement(term298540, 72, 'e');
        setCharElement(term298540, 73, 'e');
        setCharElement(term298540, 74, 'e');
        setCharElement(term298540, 75, 'e');
        setCharElement(term298540, 76, 'e');
        setCharElement(term298540, 77, 'e');
        setCharElement(term298540, 78, 'e');
        setCharElement(term298540, 79, 'e');
        setCharElement(term298540, 80, 'e');
        setCharElement(term298540, 81, 'e');
        setCharElement(term298540, 82, 'e');
        setCharElement(term298540, 83, 'e');
        setCharElement(term298540, 84, 'e');
        setCharElement(term298540, 85, 'e');
        setCharElement(term298540, 86, 'e');
        setCharElement(term298540, 87, 'e');
        setCharElement(term298540, 88, 'e');
        setCharElement(term298540, 89, 'e');
        setCharElement(term298540, 90, 'e');
        setCharElement(term298540, 91, 'e');
        setCharElement(term298540, 92, 'e');
        setCharElement(term298540, 93, 'e');
        setCharElement(term298540, 94, 'e');
        setCharElement(term298540, 95, 'e');
        setCharElement(term298540, 96, 'e');
        setCharElement(term298540, 97, 'e');
        setCharElement(term298540, 98, 'e');
        setCharElement(term298540, 99, 'e');
        setCharElement(term298540, 100, 'e');
        setCharElement(term298540, 101, 'e');
        setCharElement(term298540, 102, 'e');
        setCharElement(term298540, 103, 'e');
        setCharElement(term298540, 104, 'e');
        setCharElement(term298540, 105, 'e');
        setCharElement(term298540, 106, 'e');
        setCharElement(term298540, 107, 'e');
        setCharElement(term298540, 108, 'e');
        setCharElement(term298540, 109, 'e');
        setCharElement(term298540, 110, 'e');
        setCharElement(term298540, 111, 'e');
        setCharElement(term298540, 112, 'e');
        setCharElement(term298540, 113, 'e');
        setCharElement(term298540, 114, 'e');
        setCharElement(term298540, 115, 'e');
        setCharElement(term298540, 116, 'e');
        setCharElement(term298540, 117, 'e');
        setCharElement(term298540, 118, 'e');
        setCharElement(term298540, 119, 'e');
        setCharElement(term298540, 120, 'e');
        setCharElement(term298540, 121, 'e');
        setCharElement(term298540, 122, 'e');
        setCharElement(term298540, 123, 'e');
        setCharElement(term298540, 124, 'e');
        setCharElement(term298540, 125, 'e');
        setCharElement(term298540, 126, 'e');
        setCharElement(term298540, 127, 'e');
        StringBuilder term299339 = new StringBuilder();
        ((StringBuilder) term299339).append(term298540);
        StringBuilder term299399 = new StringBuilder();
        term299219 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term299219, term299219.getClass(), "name", term299279);
        setField(term299219, term299219.getClass(), "publicIdentifier", term299339);
        setField(term299219, term299219.getClass(), "systemIdentifier", term299399);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Doctype");
        Object[] args = new Object[1];
        args[0] = term299219;
        try {
            callMethod(klass, "insert", argTypes, term299087, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


