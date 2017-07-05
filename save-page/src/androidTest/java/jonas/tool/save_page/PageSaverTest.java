package jonas.tool.save_page;

import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class PageSaverTest {

    @Test
    public void shouldGetPage() throws Exception {

        PageSaver pageSaver = new PageSaver(new DummyEventCallback());

        pageSaver.getPage(
                "https://en.wikipedia.org/wiki/World_Wide_Web",
                "./save-page/build/tmp/save-page-test",
                "index.html");
    }

    private static class DummyEventCallback implements PageSaver.EventCallback {
        @Override
        public void onProgressChanged(int progress, int maxProgress, boolean indeterminate) {

        }

        @Override
        public void onProgressMessage(String fileName) {

        }

        @Override
        public void onPageTitleAvailable(String pageTitle) {

        }

        @Override
        public void onLogMessage(String message) {

        }

        @Override
        public void onError(Throwable error) {

        }

        @Override
        public void onError(String errorMessage) {

        }

        @Override
        public void onFatalError(Throwable error, String pageUrl) {

        }
    }
}