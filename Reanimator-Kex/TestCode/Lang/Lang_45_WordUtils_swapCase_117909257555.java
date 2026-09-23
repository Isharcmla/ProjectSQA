package org.apache.commons.lang;

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
import static org.apache.commons.lang.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class WordUtils_swapCase_117909257555 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public WordUtils_swapCase_117909257555() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.WordUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "KKKKkKKh\uFFDB  \uFFA0 \uFFE0      `\n`   \u001B\t\u001C{ \n  \n\u001B   \uFF80 \t\\ `  \t \u001B [` \uFF80\u001Bh\\\u001C\n\n@\u001B \n;{  \uFF9C   \u001C\t\u001C \u001B  \u001B \u001B\n\uFF80   \t\uFFE0 \uFFE0\u001C\n\t|\u001C\n ;   [\uFFBB; \t\uFFBB{\uFFBB\n;{\n{\n\n{\n{{\n\n\n\n\n\n\n{\n\n\t\t\n\n{{{{{{{{{{{{{{\n\t{{{\n\n{\n{\n\n{\n{\n{{\n{\n\t{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{\t{{{k                                                                                                                                                                                                                                              ";
        callMethod(klass, "swapCase", argTypes, null, args);
    }

};


