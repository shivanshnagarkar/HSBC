package ReverseFileContent;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ReverseContentTest {

    @Test
    public void reverse() throws IOException {

        BufferedReader mockReader = mock(BufferedReader.class);
        when(mockReader.readLine()).thenReturn("This is a sample ", " text-content file ",null);
        ReverseContent reverseContent = new ReverseContent();
        assert(reverseContent.reverseContent(mockReader)).equals(" elif tnetnoc-txet  elpmas a si sihT");

    }

}